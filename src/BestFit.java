import java.util.ArrayList;

public class BestFit implements Fit{

    @Override
    public void fit(ArrayList<Bin> arr, Item item) {

        int remain = 10;
        int rN = -1;
        for (int i = 0; i < arr.size(); i++) {
            Bin bin = arr.get(i);
            if (bin.check(item)) {

                if (remain < bin.remainCapacity - item.size)
                    remain = remain;
                else if (remain > bin.remainCapacity - item.size) {
                    remain = (bin.remainCapacity - item.size);
                    rN = i;
                } else
                    remain = remain;

            }
        }

        Bin bin;
        if (rN == -1) {
            bin = new Bin();
            if (bin.check(item)) bin.add(item);
            arr.add(bin);
        } else {
            bin = arr.get(rN);
            bin.add(item);
        }

    }

}