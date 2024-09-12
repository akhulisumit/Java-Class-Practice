import java.util.Scanner;

public class movies {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to watch movies?(yes/no)");
        String yn = sc.nextLine();
        if(yn.equalsIgnoreCase("yes")){
            System.out.println("Which language you prefer (Hindi/English)");
            String yn1 = sc.nextLine();
            if(yn1.equalsIgnoreCase("hindi")){
                System.out.println("What is your favorite genre (action/comedy/drama/horror/romance)");
                String yn2 = sc.nextLine();

                if(yn2.equalsIgnoreCase("action")){
                    System.out.println("What is you preferrence? (recent/anytime)");
                    String yn21 = sc.nextLine();

                    if(yn21.equalsIgnoreCase("recent")){
                        System.out.println("Does rattimg matters to you? (yes/no)");
                        String yn21yn = sc.nextLine();
                        if(yn21yn.equalsIgnoreCase("yes")){
                            System.out.println("war");
                        }
                        else if(yn21yn.equalsIgnoreCase("no")){
                            System.out.println("fighter");
                        }

                    }
                    else if(yn21.equalsIgnoreCase("anytime")){
                        System.out.println("Does rattimg matters to you? (yes/no)");
                        String yn21yn = sc.nextLine();
                        if(yn21yn.equalsIgnoreCase("yes")){
                            System.out.println("Dhoom");
                        }
                        else if(yn21yn.equalsIgnoreCase("no")){
                            System.out.println("Race 2");
                        }
                    }

                }



                else if(yn2.equalsIgnoreCase("comedy")){

                    System.out.println("What is you preferrence? (recent/anytime)");
                    String yn22 = sc.nextLine();
                    
                    if(yn22.equalsIgnoreCase("recent")){
                        System.out.println("Does rattimg matters to you? (yes/no)");
                        String yn22yn = sc.nextLine();
                        if(yn22yn.equalsIgnoreCase("yes")){
                            System.out.println("Bad Newz");
                        }
                        else if(yn22yn.equalsIgnoreCase("no")){
                            System.out.println("OMG 2");
                        }

                    }
                    else if(yn22.equalsIgnoreCase("anytime")){
                        System.out.println("Does rattimg matters to you? (yes/no)");
                        String yn22yn = sc.nextLine();
                        if(yn22yn.equalsIgnoreCase("yes")){
                            System.out.println("Phir Hera Phiri");
                        }
                        else if(yn22yn.equalsIgnoreCase("no")){
                          System.out.println("Hangama");  
                        }
                    }
                    
                }



                else if(yn2.equalsIgnoreCase("scifi")){
                    System.out.println("What is you preferrence? (recent/anytime)");
                    String yn23 = sc.nextLine();
                    
                    if(yn23.equalsIgnoreCase("recent")){
                        System.out.println("Does rattimg matters to you? (yes/no)");
                        String yn23yn = sc.nextLine();
                        if(yn23yn.equalsIgnoreCase("yes")){
                            System.out.println("kalki");
                        }
                        else if(yn23yn.equalsIgnoreCase("no")){
                          System.out.println("ganpath");  
                        }

                    }
                    else if(yn23.equalsIgnoreCase("anytime")){
                        System.out.println("Does rattimg matters to you? (yes/no)");
                        String yn23yn = sc.nextLine();
                        if(yn23yn.equalsIgnoreCase("yes")){
                            System.out.println("robot");
                        }
                        else if(yn23yn.equalsIgnoreCase("no")){
                          System.out.println("robot 2.0");  
                        }
                    }               
                }




                else if(yn2.equalsIgnoreCase("horror")){
                    System.out.println("What is you preferrence? (recent/anytime)");
                    String yn24 = sc.nextLine();
                    
                    if(yn24.equalsIgnoreCase("recent")){
                        System.out.println("Does rattimg matters to you? (yes/no)");
                        String yn24yn = sc.nextLine();
                        if(yn24yn.equalsIgnoreCase("yes")){
                            System.out.println("Stree 2");
                        }
                        else if(yn24yn.equalsIgnoreCase("no")){
                            System.out.println("munjaya");
                        }

                    }
                    else if(yn24.equalsIgnoreCase("anytime")){
                        System.out.println("Does rattimg matters to you? (yes/no)");
                        String yn24yn = sc.nextLine();
                        if(yn24yn.equalsIgnoreCase("yes")){
                            System.out.println("kanchan");
                        }
                        else if(yn24yn.equalsIgnoreCase("no")){
                            System.out.println("kanchana");
                        }
                    } 
                }




                else if(yn2.equalsIgnoreCase("romance")){
                    System.out.println("What is you preferrence? (recent/anytime)");
                    String yn25 = sc.nextLine();
                    
                    if(yn25.equalsIgnoreCase("recent")){
                        System.out.println("Does rattimg matters to you? (yes/no)");
                        String yn25yn = sc.nextLine();
                        if(yn25yn.equalsIgnoreCase("yes")){
                            System.out.println("kho gaye hum kaha");
                        }
                        else if(yn25yn.equalsIgnoreCase("no")){
                            System.out.println("Bad Newz");
                        }

                    }
                    else if(yn25.equalsIgnoreCase("anytime")){
                        System.out.println("Does rattimg matters to you? (yes/no)");
                        String yn25yn = sc.nextLine();
                        if(yn25yn.equalsIgnoreCase("yes")){
                            System.out.println("Dileale Dulhania le Jayenge");
                        }
                        else if(yn25yn.equalsIgnoreCase("no")){
                            System.out.println("mohabatein");
                        }
                    }
                }                
            }





            if(yn1.equalsIgnoreCase("english")){
                System.out.println("What is your favorite genre (action/comedy/drama/horror/romance)");
                String yn3 = sc.nextLine();

                if(yn3.equalsIgnoreCase("action")){
                    System.out.println("What is you preferrence? (recent/anytime)");
                    String yn31 = sc.nextLine();

                    if(yn31.equalsIgnoreCase("recent")){
                        System.out.println("Does rattimg matters to you? (yes/no)");
                        String yn31yn = sc.nextLine();
                        if(yn31yn.equalsIgnoreCase("yes")){
                            System.out.println("Spiderman-no way home");
                        }
                        else if(yn31yn.equalsIgnoreCase("no")){
                         System.out.println("Top Gun");   
                        }

                    }
                    else if(yn31.equalsIgnoreCase("anytime")){
                        System.out.println("Does rattimg matters to you? (yes/no)");
                        String yn31yn = sc.nextLine();
                        if(yn31yn.equalsIgnoreCase("yes")){
                            System.out.println("Avengers Endgame");
                        }
                        else if(yn31yn.equalsIgnoreCase("no")){
                            System.out.println("John Wick");   
                        }
                    }

                }



                else if(yn3.equalsIgnoreCase("comedy")){

                    System.out.println("What is you preferrence? (recent/anytime)");
                    String yn32 = sc.nextLine();
                    
                    if(yn32.equalsIgnoreCase("recent")){
                        System.out.println("Does rattimg matters to you? (yes/no)");
                        String yn32yn = sc.nextLine();
                        if(yn32yn.equalsIgnoreCase("yes")){
                            System.out.println("Young Sheldon");
                        }
                        else if(yn32yn.equalsIgnoreCase("no")){
                            System.out.println("Hangover");
                        }

                    }
                    else if(yn32.equalsIgnoreCase("anytime")){
                        System.out.println("Does rattimg matters to you? (yes/no)");
                        String yn32yn = sc.nextLine();
                        if(yn32yn.equalsIgnoreCase("yes")){
                            System.out.println("F.R.I.E.N.D.s");
                        }
                        else if(yn32yn.equalsIgnoreCase("no")){
                            System.out.println("fall guy");   
                        }
                    }
                    
                }



                else if(yn3.equalsIgnoreCase("scifi")){
                    System.out.println("What is you preferrence? (recent/anytime)");
                    String yn33 = sc.nextLine();
                    
                    if(yn33.equalsIgnoreCase("recent")){
                        System.out.println("Does rattimg matters to you? (yes/no)");
                        String yn33yn = sc.nextLine();
                        if(yn33yn.equalsIgnoreCase("yes")){
                            System.out.println("Kingdom of the planets of the apes");
                        }
                        else if(yn33yn.equalsIgnoreCase("no")){
                            System.out.println("spaceman");
                        }

                    }
                    else if(yn33.equalsIgnoreCase("anytime")){
                        System.out.println("Does rattimg matters to you? (yes/no)");
                        String yn33yn = sc.nextLine();
                        if(yn33yn.equalsIgnoreCase("yes")){
                            System.out.println("interstellar");
                        }
                        else if(yn33yn.equalsIgnoreCase("no")){
                            System.out.println("predestination");
                        }
                    }               
                }




                else if(yn3.equalsIgnoreCase("horror")){
                    System.out.println("What is you preferrence? (recent/anytime)");
                    String yn34 = sc.nextLine();
                    
                    if(yn34.equalsIgnoreCase("recent")){
                        System.out.println("Does rattimg matters to you? (yes/no)");
                        String yn34yn = sc.nextLine();
                        if(yn34yn.equalsIgnoreCase("yes")){
                            System.out.println("A quite Place");
                        }
                        else if(yn34yn.equalsIgnoreCase("no")){
                            System.out.println("Abigail");
                        }

                    }
                    else if(yn34.equalsIgnoreCase("anytime")){
                        System.out.println("Does rattimg matters to you? (yes/no)");
                        String yn34yn = sc.nextLine();
                        if(yn34yn.equalsIgnoreCase("yes")){
                            System.out.println("Conjuring");
                        }
                        else if(yn34yn.equalsIgnoreCase("no")){
                            System.out.println("anaballe");   
                        }
                    } 
                }




                else if(yn3.equalsIgnoreCase("romance")){
                    System.out.println("What is you preferrence? (recent/anytime)");
                    String yn35 = sc.nextLine();
                    
                    if(yn35.equalsIgnoreCase("recent")){
                        System.out.println("Does rattimg matters to you? (yes/no)");
                        String yn35yn = sc.nextLine();
                        if(yn35yn.equalsIgnoreCase("yes")){
                            System.out.println("Anyone but you");
                        }
                        else if(yn35yn.equalsIgnoreCase("no")){
                            System.out.println("float");
                        }

                    }
                    else if(yn35.equalsIgnoreCase("anytime")){
                        System.out.println("Does rattimg matters to you? (yes/no)");
                        String yn35yn = sc.nextLine();
                        if(yn35yn.equalsIgnoreCase("yes")){
                            System.out.println("50 shades of grey");
                        }
                        else if(yn35yn.equalsIgnoreCase("no")){
                            System.out.println("The notebook");   
                        }
                    }
                }                
            }
        }
        else{
            System.out.println("Thank you very much!");
        }
        sc.close();
    }
    
}
