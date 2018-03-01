package agency.tango.materialintro;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import agency.tango.materialintroscreen.SlideFragment;

public class CustomSlide extends SlideFragment {

    private TextView wtTitle, wtDescription;
    private ImageView wtImage;

    private String title, description, image;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_custom_slide, container, false);

        wtTitle = (TextView) view.findViewById(R.id.wtTitle);
        wtDescription = (TextView) view.findViewById(R.id.wtDescription);
        wtImage = (ImageView) view.findViewById(R.id.wtImage);


        return view;
    }

    public String getTextColor() {
        return "#FFFFFF";
    }

    @Override
    public String backgroundColor() {
        return "#FFFFFF";
    }

    @Override
    public String buttonsColor() {
        return "#00FFFF";

    }

    @Override
    public String pageIndicatorColor() {
        return "#000000";
    }

    @Override
    public String pageIndicatorBackgroundColor() {
        return "#000000";
    }

    @Override
    public boolean canMoveFurther() {
        return true;
    }

    @Override
    public String cantMoveFurtherErrorMessage() {
        return getString(R.string.error_message);
    }
}