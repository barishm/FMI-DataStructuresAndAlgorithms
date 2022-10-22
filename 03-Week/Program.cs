using System;

namespace _03_Week
{
    internal class Program
    {
        static void InsertionSort(int[] arr)
        {
            for (int i = 0; i < arr.Length - 1; i++)
            {
                for (int j = i + 1; j > 0; j--)
                {
                    if (arr[j - 1] > arr[j])
                    {
                        int temp = arr[j - 1];
                        arr[j - 1] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }

        static void SelectionSort(int[] arr)
        {
            for (int i = 0; i < arr.Length - 1; i++)
            {
                int smallest = i;
                for (int j = i + 1; j < arr.Length; j++)
                {
                    if (arr[j] < arr[smallest])
                    {
                        smallest = j;
                    }
                }

                int temp = arr[smallest];
                arr[smallest] = arr[i];
                arr[i] = temp;
            }
        }

        static void BubbleSort(int[] arr)
        {
            for (int i = 0; i < arr.Length; i++)
            {
                for (int j = 0; j < arr.Length - 1; j++)
                {
                    if (arr[j] > arr[j + 1])
                    {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }

        static int BinarySearch(int[] arr, int key)
        {
            int left = 0;
            int right = arr.Length - 1;


            while (left <= right)
            {
                Console.WriteLine("Binary search iteration");

                int mid = (left + right) / 2;

                if (key == arr[mid])
                {
                    return mid;
                }
                else if (key < arr[mid])
                {
                    right = mid - 1;
                }
                else
                {
                    left = mid + 1;
                }
            }

            return -1;
        }

        static int Find(int[] arr, int key)
        {
            for (int i = 0; i < arr.Length; i++)
            {
                Console.WriteLine("Linear search iteration");

                if (arr[i] == key)
                {
                    return i;
                }
            }

            return -1;
        }

        static void PrintArray(int[] arr)
        {
            for (int i = 0; i < arr.Length; i++)
            {
                Console.Write(arr[i] + " ");
            }
        }
        static void Main(string[] args)
        {
            
        }
    }
}
