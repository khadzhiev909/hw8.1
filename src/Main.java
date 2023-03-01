public class Main {
    public static void main(String[] args) {
        task1();
    }

    private static void task1() {

        //Целочисленный массив, заполненный тремя цифрами — 1, 2 и 3 — с помощью ключевого слова new.

        int[] nums = new int[3];

        nums[0] = 1;
        nums[1] = 2;
        nums[2] = 3;

        //Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую. В конце строки запятую ставить не надо.


        for (int i = 0; i < nums.length; i++) {
            if (i != nums.length - 1) {
                System.out.print(nums[i] + ",");
            } else  {
                System.out.println(nums[i]);
            }
        }
        //Массив, в котором можно хранить три дробных числа — 1.57, 7.654, 9.986. Массив сразу заполните значениями.

        double[] nums1 = {1.57, 7.654, 9.986};

        //Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую. В конце строки запятую ставить не надо.

        for (int i = 0; i < nums1.length; i++) {
            if (i != nums1.length - 1) {
                System.out.print(nums1[i] + ",");
            } else  {
                System.out.println(nums1[i]);
            }

        }

        //Произвольный массив. Тип и количество данных определите сами. Самостоятельно выберите способ создания массива: с помощью ключевого слова или сразу заполненный элементами.

        int[] num3 = new int[3];
        num3[0] = 90;

        //Распечатайте на отдельной строчке элементы каждого массива по порядку через запятую. В конце строки запятую ставить не надо.

        for (int i = 0; i < nums1.length; i++) {

            if (i != nums1.length - 1) {
                System.out.print(num3[i] + ",");
            } else  {
                System.out.println(num3[i]);
            }
        }

        //Распечатайте на отдельной строчке элементы каждого массива в обратном порядке через запятую. В конце строки запятую ставить не надо.

        for (int i = nums.length - 1 ; i >= 0; i--) {
            if (i != nums1.length - 3 ) {
                System.out.print(nums[i] + ",");
            } else  {
                System.out.print(nums[i]);
            }
        }
        System.out.println();
        //Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1)

        for (int i = 0; i  < nums.length; i++) {

            if (nums[i] % 2 == 0) {
                System.out.print(nums[i] + ",");
            } else {
                System.out.print(nums[i] + 1 + ",");
            }
        }


    }

}