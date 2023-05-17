package Algoritmos_Ordenamiento_Busqueda;

import java.util.*;

public class Practica_5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int handsCount = scanner.nextInt();
        scanner.nextLine(); // Consumir la línea vacía

        for (int i = 0; i < handsCount; i++) {
            String hand = scanner.nextLine();
            String[] cards = hand.split(" ");
            mergeSort(cards, 0, cards.length - 1);
            System.out.println(String.join(" ", cards));
        }
    }

    private static void mergeSort(String[] array, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(array, left, mid);
            mergeSort(array, mid + 1, right);
            merge(array, left, mid, right);
        }
    }

    private static void merge(String[] array, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        String[] leftArray = new String[n1];
        String[] rightArray = new String[n2];

        for (int i = 0; i < n1; i++) {
            leftArray[i] = array[left + i];
        }

        for (int j = 0; j < n2; j++) {
            rightArray[j] = array[mid + j + 1];
        }

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (compareCards(leftArray[i], rightArray[j]) <= 0) {
                array[k] = leftArray[i];
                i++;
            } else {
                array[k] = rightArray[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            array[k] = leftArray[i];
            i++;
            k++;
        }

        while (j < n2) {
            array[k] = rightArray[j];
            j++;
            k++;
        }
    }

    private static int compareCards(String card1, String card2) {
        if (card1.length() < 2 || card2.length() < 2) {
            return 0; // Manejar caso de cadena inválida
        }

        int valueComparison = compareCardValues(card1.charAt(0), card2.charAt(0));
        if (valueComparison != 0) {
            return valueComparison;
        } else {
            return compareCardSuits(card1.charAt(1), card2.charAt(1));
        }
    }

    private static int compareCardValues(char value1, char value2) {
        String values = "A23456789TJQK";
        return values.indexOf(value1) - values.indexOf(value2);
    }

    private static int compareCardSuits(char suit1, char suit2) {
        String suits = "ECTD";
        return suits.indexOf(suit1) - suits.indexOf(suit2);
    }
}
