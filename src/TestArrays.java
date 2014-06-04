import java.lang.*;
public class TestArrays {

	public static void main(String arg[]){
		
		int arr1 [] = new int[3];
		String arr2 [] = new String[3];
		char arr3 [] = new char [3];
		boolean [] arr4 = {true,false};
		
		// Le paso al for, desde donde hasta donde trabaja.
		// ejemplo (int i=0; i<10; i++) ejecuta lo q este dentro del for, las veces hasta que se cumpla i<10)
		
		for (int i=0;i<=2;i++){
			arr1 [i] = (int)(Math.random()*10);;             // le paso y le asigno el mismo valor a c/lugar//
			}
	
		arr2 [0] = "uno";
		arr2 [1] = "dos";
		arr2 [2] = "tres";
		
		arr3 [0] = 'a';
		arr3 [1] = 'b';
		arr3 [2] = 'c';
		
		System.out.println("-------------");
		System.out.println("Array String");
		
		for (int k=0;k<=2;k++){
			System.out.println(arr2[k]);
		}
		
		System.out.println("-------------");
		System.out.println("Array char");
		
		for (int m=arr3.length-1;m>=0;m--){          //aca arranca del valor mas alto del array (length)da la cantidad de elementos no la pos. por eso "-1" y recorre para atras
			System.out.println(arr3[m]);
		}
		
		System.out.println("-------------");
		System.out.println("Array enteros de atras adelante");	
		
		for (int n=arr1.length-1;n>=0;n--){          //aca arranca del valor mas alto del array (length)da la cantidad de elementos no la pos. por eso "-1" y recorre para atras
			System.out.println(arr1[n]);
		}
		
		
		int men = arr1[0];
		int pos = 0;
		
		for (int u=1; u<3; u++){
			
			if (arr1[u]<= men){
				men=arr1[u];
				pos=u;
			}
		}
		
		System.out.println("-------------");
		
		System.out.println("el menor numero del array es: "+men+" es el de la pos: "+pos);
		  // tener en cuenta q estamos mostrando los num al rev. en el syso ant.//
		
		int aux1 = arr1[0];
		int aux2 = arr1[2];
		arr1[2] = aux1;
		arr1[0] = aux2;
//		for (int t=1; t<3; t++){
//			arr1[t-1] = arr1[t];
//		}
		
		arr1[arr1.length-1] = aux1;
		
		System.out.println("Array invertido");
		
		for (int s=0;s<=arr1.length-1;s++){
			System.out.println(arr1[s]);
		}
		}


}