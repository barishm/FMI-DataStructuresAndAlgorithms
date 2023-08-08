using System;

namespace homework
{
    internal class Program
    {

        // zad1
        static int returnSumOfArray(int n)
        {
            int sum = 0;

            int[] array = new int[n];
            for (int i = 0; i < n; i++)
            {
                array[i] = int.Parse(Console.ReadLine());
                sum += array[i];
            }

            return sum;
        }
        // zad2
        static int returnMostDuplicatedInt(int[] arr)
        {
            int number = 0;
            int count = 0; // count of most dublicated
            int tempCount = 1;

            for (int i = 0; i < arr.Length - 1; i++)
            {
                if (arr[i] == arr[i + 1])
                    tempCount++;

                if (i == (arr.Length - 2) || arr[i] != arr[i + 1])
                {
                    if (tempCount > count)
                    {
                        count = tempCount;
                        number = arr[i];
                    }

                    tempCount = 1;
                }
            }
            return number;
        }


        // zad3
        static bool isMagicSquare(int[,] mat)
        {
            int N = mat.GetLength(0);

            int sumd1 = 0, sumd2 = 0;

            for (int i = 0; i < N; i++)
            {
                sumd1 = sumd1 + mat[i, i];
                sumd2 = sumd2 + mat[i, N - 1 - i];
            }

            if (sumd1 != sumd2)
                return false;

            for (int i = 0; i < N; i++)
            {

                int rowSum = 0, colSum = 0;
                for (int j = 0; j < N; j++)
                {
                    rowSum += mat[i, j];
                    colSum += mat[j, i];
                }
                if (rowSum != colSum || colSum != sumd1)
                    return false;
            }

            return true;
        }
        //zad 4
        static bool isMonotonic()
        {
            int[] array = new int[9];
            for (int i = 0; i < array.Length; i++)
            {
                array[i] = int.Parse(Console.ReadLine());
            }
            int n = array.Length;
            bool inc = true;
            bool dec = true;

            for (int i = 0; i < n - 1; i++)
            {
                if (array[i] > array[i + 1])
                {
                    inc = false;
                }
            }

            for (int i = 0; i < n - 1; i++)
            {


                if (array[i] < array[i + 1])
                {
                    dec = false;
                }
            }
            return (inc || dec);
        }
        //zad 5
        public static int nextPrime(int n)
        {
            for (int i = 2; i < n; i++)
            {
                if (n % i == 0) { n++; i = 2; }
            }
            return n;
        }
        //zad 6
        static int SumOfDigits(int n)
        {
            if (n == 0)
                return 0;


            return (n % 10 + SumOfDigits(n / 10));
        }
        static void Main(string[] args)
        {
            //returnSumOfArray(5);
            //int[] arr = { 1, 2, 3, 4, 4, 5 };
            //int[,] mat = new int[,] {{ 2, 7, 6 },
            //{ 9, 5, 1 },
            //{ 4, 3, 8 }};
            //Boolean bo = isMagicSquare(mat);
            //Console.WriteLine(bo);
            //int a = nextPrime(98);
            //Console.WriteLine(a);
            //int sum = SumOfDigits(1231);
            //Console.WriteLine(sum);
            bool a = isMonotonic();
            Console.WriteLine(a);
        }
    }
}
