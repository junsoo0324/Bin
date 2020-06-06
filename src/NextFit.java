import java.util.ArrayList;

public class NextFit implements Fit{

    @Override
    public void fit(ArrayList<Bin> arr, Item item) {

        for (int i = 0; i < arr.size(); i++) {
            Bin bin = arr.get(arr.size()-1);
            if(bin.check(item)) {
                bin.add(item);
                return;
            }
        }

        Bin bin = new Bin();
        if(bin.check(item)) bin.add(item);
        arr.add(bin);

    }

}