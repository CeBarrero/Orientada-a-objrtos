import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author barre
 * @param billetes de 50000,20000,10000,5000,2000,1000, monedas de 500,100,25,10,5,2,1
 */
public class Dinero {
    
    public static void main(String[] args) throws IOException {
        
        System.out.println("Introduzca valor a desglozar");
        
        BufferedReader number1 = new BufferedReader(new InputStreamReader(System.in));
        int dinero = Integer.valueOf(number1.readLine());
        
        int moneda = dinero;
        int b50000 = 0, b20000 = 0, b10000 = 0, b5000 = 0, b2000 = 0, b1000 = 0, m500 = 0, m100 = 0, m50 = 0, m25 = 0, m10 = 0, m5 = 0, m2 = 0, m1 = 0;
        
        while (moneda>0){
            if (moneda % 50000 == 0){
                b50000 ++;
                moneda -= 50000;
            } else {
                if (moneda % 20000 == 0){
                    b20000 ++;
                    moneda -= 20000;
                } else {
                    if (moneda % 10000 == 0){
                        b10000 ++;
                        moneda -= 10000;
                    } else {
                        if (moneda % 5000 == 0){
                            b5000 ++;
                            moneda -= 5000;
                        } else {
                            if (moneda % 2000 == 0){
                                b2000 ++;
                                moneda -= 2000;
                            } else {
                                if (moneda % 1000 == 0){
                                    b1000 ++;
                                    moneda -= 1000;
                                } else {
                                    if (moneda % 500 == 0){
                                        m500 ++;
                                        moneda -= 500;
                                    } else {
                                        if (moneda % 100 == 0){
                                            m100 ++;
                                            moneda -= 100;
                                        } else {
                                            if (moneda % 50 == 0){
                                                m50 ++;
                                                moneda -= 50;
                                            } else {
                                                if (moneda % 25 == 0){
                                                    m25 ++;
                                                    moneda -= 25;
                                                } else {
                                                    if (moneda % 10 == 0){
                                                        m10 ++;
                                                        moneda -= 10;
                                                    } else {
                                                        if (moneda % 5 == 0){
                                                            m5 ++;
                                                            moneda -= 5;
                                                        } else {
                                                            if (moneda % 2 == 0){
                                                                m2 ++;
                                                                moneda -= 2;
                                                            } else {
                                                                m1 ++;
                                                                moneda -= 1;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (b50000>1){
                System.out.println(b50000 + "billetes de 50000");
            } else {
                if (b20000>1){
                System.out.println(b20000 + "billetes de 20000");
                } else {
                    if (b10000>1){
                    System.out.println(b10000 + "billetes de 10000");
                    } else {
                           if (b5000>1){
                           System.out.println(b5000 + "billetes de 5000");
                           } else {
                               if (b2000>1){
                               System.out.println(b2000 + "billetes de 2000");
                               } else {
                                   if (b1000>1){
                                   System.out.println(b1000 + "billetes de 1000");
                                   } else {
                                       if (m500>1){
                                       System.out.println(m500 + "monedas de 500");
                                       } else {
                                           if (m100>1){
                                           System.out.println(m100 + "monedas de 100");
                                           } else {
                                               if (m50>1){
                                               System.out.println(m50 + "monedas de 50");
                                               } else {
                                                   if (m25>1){
                                                   System.out.println(m25 + "monedas de 25");
                                                   } else {
                                                       if (m10>1){
                                                       System.out.println(m10 + "monedas de 10");
                                                       } else {
                                                           if (m5>1){
                                                           System.out.println(m5 + "monedas de 5");
                                                           } else {
                                                               if (m2 >1){
                                                               System.out.println(m2+ "monedas de 2");
                                                               } else {
                                                                   if (m1 == 1){
                                                                       System.out.println(m1 + "monedas de 1");
                                                                   }
                                                               }
                                                           }
                                                       }
                                                   }
                                               }
                                           }
                                       }
                                   }
                               }
                           }
                    }
                }
            }
        }
    }
    
}
