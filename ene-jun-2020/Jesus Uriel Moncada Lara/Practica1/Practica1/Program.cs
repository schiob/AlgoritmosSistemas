using System;
using System.Collections.Generic;
using System.IO;
class Solution
{
    static void Main(String[] args)
    {
       
        String n = Console.ReadLine();

        for (int i = 0; i < 1; i++)
        {
            string[] arreglo = n.Split();
            int a = int.Parse(arreglo[0]);
            int b = int.Parse(arreglo[1]);
            Console.WriteLine(a + b);
        }



    }
}