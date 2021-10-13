import java.time.Duration;
import java.time.Instant;

class MergeSortGeneric<T extends Comparable<? super T>> 
{
    void mergeSort(T[] array, int start, int end)
    {
        if (start < end)
        {
            int middle = (start + end) / 2;

            mergeSort(array, start, middle);
            mergeSort(array, middle + 1, end);

            merge(array, start, middle, end);
        }
    }

    void merge(T[] array, int start, int middle, int end)
    {
        T[] leftArray  = (T[]) new Comparable[middle - start + 1];
        T[] rightArray = (T[]) new Comparable[end - middle];

        for (int i = 0; i < leftArray.length; ++i)
        {
            leftArray[i] = array[start + i];
        }
            
        for (int i = 0; i < rightArray.length; ++i)
        {
            rightArray[i] = array[middle + 1 + i];
        }

        int leftIndex = 0, rightIndex = 0;
        int currentIndex = start;

        while (leftIndex < leftArray.length && rightIndex < rightArray.length)
        {
            if (leftArray[leftIndex].compareTo(rightArray[rightIndex]) <= 0)
            {
                array[currentIndex] = leftArray[leftIndex];
                leftIndex++;
            }
            else
            {
                array[currentIndex] = rightArray[rightIndex];
                rightIndex++;
            }
            currentIndex++;
        }

        while (leftIndex < leftArray.length)
        {
            array[currentIndex++] = leftArray[leftIndex++];
        } 

        while (rightIndex < rightArray.length) 
        {
            array[currentIndex++] = rightArray[rightIndex++];
        }
    }

    public static void main(String[] args)
    {
        String[] arrayOfStrings = {"Andree", "Leana", "Faviola", "Loyce", "Quincy", "Milo", "Jamila", "Toccara", "Nelda", "Blair", "Ernestine", "Chara", "Kareen", "Monty", "Rene", "Cami", "Winifred", "Tara", "Demetrice", "Azucena"};
        MergeSortGeneric<String> stringSorter   = new MergeSortGeneric<>();
        Instant inicio = Instant.now();
        stringSorter.mergeSort(arrayOfStrings, 0, arrayOfStrings.length - 1);
        long duration = Duration.between(inicio,Instant.now()).toNanos();
        System.out.printf("Mergesort de Strings demoró %d nanosegundos\n",duration);
        System.out.println(java.util.Arrays.toString(arrayOfStrings));

        Double[] arrayOfDoubles = {0.35, 0.02, 0.36, 0.82, 0.27, 0.49, 0.41, 0.17, 0.30, 0.89, 0.37, 0.66, 0.82, 0.17, 0.20, 0.96, 0.18, 0.25, 0.37, 0.52};
        MergeSortGeneric<Double> doubleSorter   = new MergeSortGeneric<>();
        inicio = Instant.now();
        doubleSorter.mergeSort(arrayOfDoubles, 0, arrayOfDoubles.length - 1);
        duration = Duration.between(inicio,Instant.now()).toNanos();
        System.out.printf("Mergesort de Doubles demoró %d nanosegundos\n",duration);
        System.out.println(java.util.Arrays.toString(arrayOfDoubles));
    }
}