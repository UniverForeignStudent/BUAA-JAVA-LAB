package scs;

import java.util.Scanner;
class REGISTER {
	static int upper1=0;
	static int xuehao1=0;
	static String Type;
	
	void upper(String n) {
		int i =0;
		upper1=0;
		if(Character.isUpperCase(n.charAt(i))) {
			for(i = 1; i<n.length();i++)
			{
				if(Character.isLowerCase(n.charAt(i))) {
					upper1 = 1;
				}else {
					upper1=0;
					break;
				}
			}
		}else {
			upper1=0;
		}
	}
	
	void xuehao(String n) {
		String[] array_xuehao;
		
		if(n.length()==8) {
			array_xuehao = n.split("");
			String ruxue = array_xuehao[0]+array_xuehao[1];
			String xueyuan = array_xuehao[2]+array_xuehao[3];
			String daban = array_xuehao[4];
			String san = array_xuehao[5]+array_xuehao[6]+array_xuehao[7];
			

			int ruxue1=Integer.parseInt(ruxue);
			int xueyuan1=Integer.parseInt(xueyuan);
			int daban1=Integer.parseInt(daban);
			
			if(ruxue1>=17 && ruxue1<=22) {
				if(xueyuan1>=01 && xueyuan1<=43) {
					if(daban1>=1&&daban1<=6) {
						if(san.length()==3) {
							xuehao1=1;
							Type="Student";
						}
					}
				}
			}else if(n.length()==5) {
				
				xuehao1=1;
				Type="Professor";

			}else if(n.length()==10) {
				array_xuehao=n.split("");
				
				String yanjiusheng= array_xuehao[0]+array_xuehao[1];
				ruxue=array_xuehao[2]+array_xuehao[3];
				xueyuan=array_xuehao[4]+array_xuehao[5];
				daban=array_xuehao[6];
				san=array_xuehao[7]+array_xuehao[8]+array_xuehao[9];
			
				ruxue1=Integer.parseInt(ruxue);
				xueyuan1=Integer.parseInt(xueyuan);
				daban1=Integer.parseInt(daban);
				
				if(yanjiusheng.equals("SY")) {
					if(ruxue1>=17 && ruxue1<=22) {
						if(xueyuan1>=01 && xueyuan1<=43) {
							if(daban1>=1&&daban1<=6) {
								if(san.length()==3) {
									xuehao1=1;
									Type="Student";
								}
							}
						}
					}
				}else if(yanjiusheng.equals("ZY")) {
					if(ruxue1>=17 && ruxue1<=22) {
						if(xueyuan1>=01 && xueyuan1<=43) {
							if(daban1>=1&&daban1<=6) {
								if(san.length()==3) {
									xuehao1=1;
									Type="Student";
								}
							}
						}
					}
				}else if(yanjiusheng.equals("BY")) {
					if(ruxue1>=17 && ruxue1<=22) {
						if(xueyuan1>=01 && xueyuan1<=43) {
							if(daban1>=1&&daban1<=6) {
								if(san.length()==3) {
									xuehao1=1;
									Type="Student";
								}
							}
						}
					}
				}
				
			}
			
		}
	}
}


public class main {
	
		
	
		public static void main(String[] args) {
			
		
			
			
			boolean res;
			String type;
			String[] registerarray=new String[10];

			String[] temp_array=new String[10];
			int confirm=0;
			int confirm2=1;
			var lo = "logout";
			int first = 1;
			int z=1;
	
			
			String[][] seat = new String[6][];
			
			
			var sc = new Scanner(System.in);
		
			while(sc.hasNextLine()) {
				
				var cmd = sc.nextLine();
				REGISTER rg = new REGISTER();
				//---------------------------QUIT----------------------------
				if(cmd.equals("QUIT")) {
					System.out.println("----- Good Bye! ------");
					break;
				}
				
			//---------------------------print--------------------------------------------
				if(cmd.equals("printInfo")){
					if(registerarray[1].length()==5) {
					System.out.println("Name: "+registerarray[1]+" "+registerarray[2]);
					System.out.println("ID: "+registerarray[0]);
					System.out.println("Type: "+ rg.Type);
					System.out.println("Email: "+registerarray[3]);}
					else {
						System.out.println("Name: "+registerarray[1]+" "+registerarray[2]);
						System.out.println("ID: "+registerarray[0]);
						System.out.println("Type: "+rg.Type);
						System.out.println("Email: "+registerarray[3]);
					}
				}
				//----------------------------------register----------------------------
				var command = cmd.trim().split("\\s+");
	
				
				
				int y=0;
				
				int result = REGISTER.upper1;
				if(command[0].equals("register")) {
					if(first==1) {
						
						rg.xuehao(command[1]);
						if(rg.xuehao1==1) {
							rg.upper(command[2]);
							if(rg.upper1==1) {
								rg.upper(command[3]);
								if(rg.upper1 == 1) {
									if(res = command[4].matches("\\w+@\\w+(\\.\\w+)+")) {
										if(command[5].length()>=8 && command[5].length()<=16) {
											if(command[5].equals(command[6])) {
												System.out.println("register success");
												registerarray = new String[]{command[1],command[2],command[3],command[4],command[5],rg.Type};
												
											}else {System.out.println("passwords inconsistent");}
										}else {System.out.println("password illegal");}
									}else {System.out.println("email adress illegal");}
								}else {System.out.println("user name illegal");}
							}else {System.out.println("user name illegal");}
						}else {System.out.println("user id illegal");}
					}else {System.out.println("already logged in");}
				}
				
				//-------------------------login------------------
				
				command = cmd.trim().split("\\s+");
				if(command[0].equals("login")) {
					if (confirm2==1) {
						rg.xuehao(command[1]);
						if(rg.xuehao1==1) {
						if(command[1].equals(registerarray[0])) {
							if(command[2].equals(registerarray[4])) {
								if(command[1].length()==5) {
									if(command[2].equals(registerarray[4])) {
										type = "Professor";
										System.out.println("Hello "+type+" "+registerarray[2]+"~");
										confirm=1;
										confirm2=0;
										first = 0;	
									}else {System.out.println("wrong password");}	
								}
								else if(command[1].length()>=8) {
									if(command[2].equals(registerarray[4])) {
										System.out.println("Hello "+registerarray[1]+"~");
										confirm=1;
										confirm2=0;
										first = 0;
									}else {System.out.println("wrong password");}		
								}	
							}else {System.out.println("wrong password");}
						}	
						else{System.out.println("user id not exist");}
					}else {System.out.println("user id illegal");}
					}else {	System.out.println("already logged in");}
				}
				//---------------------------logout-----------------------------
			
			if(command[0].equals(lo)) {
				if(confirm==1) {
					System.out.println("Bye~");	
					first =1 ;
					confirm2 = 1;
				}else{System.out.println("not logged in");}
			}
				
			}	
		}
}

