
package practise_1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	

	
public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 System.out.println("What do you want to do ? Please write 'Encode' if you want to encode, or 'Decode' if you want to decode");
		 char typeArray [] = new char[10];
		 typeArray[0] = scanner.next().charAt(0);
		 
		 if(typeArray[0] == 'E' || typeArray[0] == 'e') {
		    Encode();
		 }
		 else if(typeArray[0] == 'D' || typeArray[0] == 'd') {
		    Decode();
		 }
		 else
			 System.out.println("Error. Please enter the strings again!  ");
		    
		    
}
	
	
	
	public static void Encode()
    {
			 Scanner scan = new Scanner(System.in);
				System.out.println("Enter the strings : ");
				String cArray = scan.nextLine();
				byte[] bArray = cArray.getBytes();
				StringBuilder buffer = new StringBuilder();
				scan.close();

				 char[] tbl = new char [64]; 
					for (int i = 0; i <64; i++){
						
						if (i <26) {
							tbl[i] = (char)('A'+i);
						} else if (i < 52) {
							tbl[i] = (char)('a'+(i-26));
						}else if (i < 62) {
							tbl[i] = (char)('0'+(i-52));
						}else if (i == 62) {
							tbl[i] = '+';
						}else {
							tbl[i] = '/';
						}
					}
			        
			        int count = 0;
			        for (int i = 0; i < bArray.length; i += 3) {
			        	
			            int b = ((bArray[i] & 0xFF) << 16) & 0xFFFFFF;
			            
			            if (i + 1 < bArray.length) {
			                b |= (bArray[i+1] & 0xFF) << 8;
			            } else {
			            	count++;
			            }
			            if (i + 2 < bArray.length) {
			                b |= (bArray[i+2] & 0xFF);
			            } else {
			            	count++;
			            }

			            for (int j = 0; j < 4 - count; j++) {
			                int c = (b & 0xFC0000) >> 18;
			                buffer.append(tbl[c]);
			                b <<= 6;
			            }
			        }
			        for (int j = 0; j < count; j++) {
			            buffer.append("=");
			        }

				System.out.println("The result is    " + buffer.toString());
		 
		 
    }
	
	
	
	
	public static void Decode()
    {
			
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the strings : ");
			String cArray = scan.nextLine();
			byte[] bArray = cArray.getBytes();
			int [] nArray = new int [bArray.length]; 
			scan.close();
			 

			 char[] tbl = new char [64]; 
				for (int i = 0; i <64; i++){
					
					if (i <26) {
						tbl[i] = (char)('A'+i);
					} else if (i < 52) {
						tbl[i] = (char)('a'+(i-26));
					}else if (i < 62) {
						tbl[i] = (char)('0'+(i-52));
					}else if (i == 62) {
						tbl[i] = '+';
					}else {
						tbl[i] = '/';
					}
				}
				
			for(int i = 0; i < bArray.length; i++) {
			        nArray[i] = Main.numbering(bArray[i]);
		}
		
		
			StringBuilder buffer = new StringBuilder();
			int count = 0; 
			for (int i = 0; i < bArray.length; i += 4) {
				    int b = ((nArray[i] & 0xFF) << 18) & 0xFFFFFF;
				    if(i + 1 < bArray.length) {
				    	b |= (nArray[i+1] & 0xFF) << 12;
			}    else {
				count++;
			}
				    if(i + 2 < bArray.length) {
				    	b |= (nArray[i+2] & 0XFF) << 6;
				    }
				    else {
				    	count++;
				    }
				    if (i + 3 < bArray.length) {
				    	b |= (nArray[i+3] & 0xFF);
				    }
				    else {
				    	count++;
				    }
			
	         
	            for (int j = 0; j < 3 - count; j++) {
	                int c = (b & 0xFF0000) >> 16;
	                char d = (char)c;
	                buffer.append(d);
	                b <<= 8;
	            }
			}
	        for (int j = 0; j < count; j++) {
	            buffer.append("=");
	        }
			
	        System.out.println("The result is    " + buffer.toString());
    
		 
    }
	
	
public static int numbering(int bArray) {
	if(bArray >= 'A' && bArray <= 'Z')
		return bArray -'A';
	else if(bArray >= 'a' && bArray <= 'z')
		return bArray - 'a' + 26;
	else if(bArray >= '0' && bArray <= '9') 
		return bArray - '0' + 52;
	else if(bArray == 62) 
		return 62;
	else
		return 63;
}	
	

	
}
