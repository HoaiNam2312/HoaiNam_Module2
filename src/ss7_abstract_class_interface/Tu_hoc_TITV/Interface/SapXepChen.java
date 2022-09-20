package ss7_abstract_class_interface.Tu_hoc_TITV.Interface;

public class SapXepChen implements SapXepInterface {
    @Override
    public void sapXepTang(double[] arr) {
        for (int i = arr.length-1; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                if (arr[i] < arr[j]) {
                    double temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    @Override
    public void sapXepGiam(double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr.length-1; j >=i; j--) {
                if (arr[i]<arr[j]) {
                    double temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
