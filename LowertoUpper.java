class LowertoUpper
{
    public static void main (String[] args)
    {
        char ch1 = 'p', ch2 = 'P';
        
        System.out.println("Character p changed to: " + (char)((ch1 >= 'a' && ch1 <= 'z') ? (ch1 - 'a' + 'A') : (ch1 - 'A' + 'a')) );
        System.out.println("Character P changed to: " + (char)((ch2 >= 'a' && ch2 <= 'z') ? (ch2 - 'a' + 'A') : (ch2 - 'A' + 'a')) );
        
    }
}
    

