public class MaxMinAvg {
    public static void main(String[] args) {
        double arr[]={12,45,32,67,89,76,32,123,456,54,32,12};

        double max=arr[0];
        double min=arr[0];
        double avg=0;
        double sum=0;


        for(int i=0;i<arr.length;i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];

            }
            sum=sum+arr[i];
        }

        System.out.println("Max number:"+max+"\nMin number:"+min+"\nSum:"+sum+"\nAverage:"+(sum)/arr.length);
        System.out.println(arr.length);

    }

}
