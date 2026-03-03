package lab1;

public class Application
{
public static void main() {
    String alfabet="";
    for (char c='a';c<='z';c++)
    {
        alfabet+=c;
    }
    System.out.println(alfabet.toLowerCase());
    System.out.println(alfabet.toUpperCase());
    String array[]=new String[30];
    for (int k = 0; k < array.length; k++) {
        array[k] = "";
    }

    int j=0;
    for (int i=0;i<alfabet.length();i++)
    {
        if(alfabet.charAt(i)=='a' || alfabet.charAt(i)=='e' || alfabet.charAt(i)=='i'|| alfabet.charAt(i)=='o'|| alfabet.charAt(i)=='u')
        {

            j++;
            array[j]+=alfabet.charAt(i);
        }
        else array[j]+=alfabet.charAt(i);
    }

    for (int i=0;i<array.length;i++)
        System.out.println(array[i]);
}
}
