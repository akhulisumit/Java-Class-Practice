import cv2
import mediapipe as mp
import pyautogui
import time

# Initialize MediaPipe Hand module
mp_hands = mp.solutions.hands
mp_drawing = mp.solutions.drawing_utils

# Function to count extended fingers
def count_fingers(hand_landmarks):
    """Count the number of extended fingers."""
    # Define landmark indices for finger tips and middle knuckles
    finger_tips = [4, 8, 12, 16, 20]  # Thumb, Index, Middle, Ring, Pinky
    finger_mcp = [3, 6, 10, 14, 18]  # MCP joints
    
    # Count extended fingers
    count = 0
    for tip, mcp in zip(finger_tips, finger_mcp):
        if hand_landmarks.landmark[tip].y < hand_landmarks.landmark[mcp].y:
            count += 1
    return count

# Gesture state variables
previous_finger_count = 0
gesture_time = time.time()

# Capture video from webcam
cap = cv2.VideoCapture(0)

with mp_hands.Hands(min_detection_confidence=0.7, min_tracking_confidence=0.5) as hands:
    while cap.isOpened():
        success, frame = cap.read()
        if not success:
            print("Ignoring empty frame.")
            continue

        # Flip the frame horizontally for a mirrored view
        frame = cv2.flip(frame, 1)
        frame_rgb = cv2.cvtColor(frame, cv2.COLOR_BGR2RGB)
        
        # Detect hand landmarks
        results = hands.process(frame_rgb)

        # Process the detected hand landmarks
        if results.multi_hand_landmarks:
            for hand_landmarks in results.multi_hand_landmarks:
                mp_drawing.draw_landmarks(frame, hand_landmarks, mp_hands.HAND_CONNECTIONS)

                # Count extended fingers
                finger_count = count_fingers(hand_landmarks)

                # Detect fast opening gesture (transition from 0 to 5 fingers)
                if previous_finger_count == 0 and finger_count == 5:
                    current_time = time.time()
                    if current_time - gesture_time < 0.5:  # Fast opening condition
                        pyautogui.press('down')  # Simulate pressing the down arrow key
                        print("Down Arrow Pressed")
                    gesture_time = current_time

                # Update previous finger count
                previous_finger_count = finger_count

        # Display the frame
        cv2.imshow('Hand Gesture Control', frame)

        # Break loop on 'q' key press
        if cv2.waitKey(5) & 0xFF == ord('q'):
            break

cap.release()
cv2.destroyAllWindows()
