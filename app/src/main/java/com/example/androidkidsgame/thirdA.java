package com.example.androidkidsgame;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class thirdA extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        ImageView img = (ImageView) findViewById(R.id.img1);
        img.setVisibility(View.VISIBLE);
        Bundle bundle = getIntent().getExtras();
        if(bundle!=null)
        {
            int res_img = bundle.getInt("apple");
            img.setImageResource(res_img);
        }

        ImageView img2 = (ImageView) findViewById(R.id.img2);
        img2.setVisibility(View.VISIBLE);
        Bundle bundle2 = getIntent().getExtras();
        if(bundle2!=null)
        {
            int res_img = bundle2.getInt("banana");
            img2.setImageResource(res_img);
        }
        ImageView img3 = (ImageView) findViewById(R.id.img3);
        img3.setVisibility(View.VISIBLE);

        Bundle bundle3 = getIntent().getExtras();
        if(bundle3!=null)
        {
            int res_img = bundle.getInt("cat");
            img3.setImageResource(res_img);
        }
        ImageView img4 = (ImageView) findViewById(R.id.img4);
        img4.setVisibility(View.VISIBLE);

        Bundle bundle4 = getIntent().getExtras();
        if(bundle4!=null)
        {
            int res_img = bundle4.getInt("dog");
            img4.setImageResource(res_img);
        }
        ImageView img5 = (ImageView) findViewById(R.id.img5);
        img5.setVisibility(View.VISIBLE);

        Bundle bundle5 = getIntent().getExtras();
        if(bundle5!=null)
        {
            int res_img = bundle5.getInt("egg");
            img5.setImageResource(res_img);
        }
        ImageView img6 = (ImageView) findViewById(R.id.img6);
        img6.setVisibility(View.VISIBLE);

        Bundle bundle6 = getIntent().getExtras();
        if(bundle6!=null)
        {
            int res_img = bundle6.getInt("fish");
            img6.setImageResource(res_img);
        }
        ImageView img7 = (ImageView) findViewById(R.id.img7);
        img7.setVisibility(View.VISIBLE);

        Bundle bundle7 = getIntent().getExtras();
        if(bundle7!=null)
        {
            int res_img = bundle7.getInt("glue");
            img7.setImageResource(res_img);
        }
        ImageView img8 = (ImageView) findViewById(R.id.img8);
        img8.setVisibility(View.VISIBLE);

        Bundle bundle8 = getIntent().getExtras();
        if(bundle8!=null)
        {
            int res_img = bundle8.getInt("hat");
            img8.setImageResource(res_img);
        }
        ImageView img9 = (ImageView) findViewById(R.id.img9);
        img9.setVisibility(View.VISIBLE);

        Bundle bundle9 = getIntent().getExtras();
        if(bundle9!=null)
        {
            int res_img = bundle9.getInt("ice");
            img9.setImageResource(res_img);
        }
        ImageView img10 = (ImageView) findViewById(R.id.img10);
        img10.setVisibility(View.VISIBLE);

        Bundle bundle10 = getIntent().getExtras();
        if(bundle10!=null)
        {
            int res_img = bundle10.getInt("jug");
            img10.setImageResource(res_img);
        }

        ImageView img11 = (ImageView) findViewById(R.id.img11);
        img11.setVisibility(View.VISIBLE);

        Bundle bundle11 = getIntent().getExtras();
        if(bundle11!=null)
        {
            int res_img = bundle11.getInt("key");
            img11.setImageResource(res_img);
        }

        ImageView img12 = (ImageView) findViewById(R.id.img12);
        img12.setVisibility(View.VISIBLE);

        Bundle bundle12 = getIntent().getExtras();
        if(bundle12!=null)
        {
            int res_img = bundle12.getInt("lion");
            img12.setImageResource(res_img);
        }
        ImageView img13 = (ImageView) findViewById(R.id.img13);
        img13.setVisibility(View.VISIBLE);

        Bundle bundle13 = getIntent().getExtras();
        if(bundle13!=null)
        {
            int res_img = bundle13.getInt("monkey");
            img13.setImageResource(res_img);
        }
        ImageView img14 = (ImageView) findViewById(R.id.img14);
        img14.setVisibility(View.VISIBLE);

        Bundle bundle14 = getIntent().getExtras();
        if(bundle14!=null)
        {
            int res_img = bundle14.getInt("nose");
            img14.setImageResource(res_img);
        }
        ImageView img15 = (ImageView) findViewById(R.id.img15);
        img15.setVisibility(View.VISIBLE);

        Bundle bundle15 = getIntent().getExtras();
        if(bundle15!=null)
        {
            int res_img = bundle15.getInt("orange");
            img15.setImageResource(res_img);
        }
        ImageView img17 = (ImageView) findViewById(R.id.img17);
        img17.setVisibility(View.VISIBLE);

        Bundle bundle17 = getIntent().getExtras();
        if(bundle17!=null)
        {
            int res_img = bundle17.getInt("pen");
            img17.setImageResource(res_img);
        }
//        ImageView img17 = (ImageView) findViewById(R.id.img17);
//        img17.setVisibility(View.VISIBLE);
//
//        Bundle bundle17 = getIntent().getExtras();
//        if(bundle17!=null)
//        {
//            int res_img = bundle17.getInt("pen");
//            img17.setImageResource(res_img);
//        }
        ImageView img18 = (ImageView) findViewById(R.id.img18);
        img18.setVisibility(View.VISIBLE);

        Bundle bundle18 = getIntent().getExtras();
        if(bundle18!=null)
        {
            int res_img = bundle18.getInt("str1");
            img18.setImageResource(res_img);
        }

        ImageView img19 = (ImageView) findViewById(R.id.img19);
        img19.setVisibility(View.VISIBLE);

        Bundle bundle19 = getIntent().getExtras();
        if(bundle19!=null)
        {
            int res_img = bundle19.getInt("ten");
            img19.setImageResource(res_img);
        }
        ImageView img20 = (ImageView) findViewById(R.id.img20);
        img20.setVisibility(View.VISIBLE);

        Bundle bundle20 = getIntent().getExtras();
        if(bundle20!=null)
        {
            int res_img = bundle20.getInt("umbrella");
            img20.setImageResource(res_img);
        }

        ImageView img21 = (ImageView) findViewById(R.id.img21);
        img21.setVisibility(View.VISIBLE);

        Bundle bundle21 = getIntent().getExtras();
        if(bundle21!=null)
        {
            int res_img = bundle21.getInt("van");
            img21.setImageResource(res_img);
        }

        ImageView img22 = (ImageView) findViewById(R.id.img22);
        img22.setVisibility(View.VISIBLE);

        Bundle bundle22 = getIntent().getExtras();
        if(bundle22!=null)
        {
            int res_img = bundle22.getInt("whale");
            img22.setImageResource(res_img);
        }

        ImageView img23 = (ImageView) findViewById(R.id.img23);
        img23.setVisibility(View.VISIBLE);

        Bundle bundle23 = getIntent().getExtras();
        if(bundle23!=null)
        {
            int res_img = bundle23.getInt("yogurt");
            img23.setImageResource(res_img);
        }

        ImageView img24 = (ImageView) findViewById(R.id.img24);
        img24.setVisibility(View.VISIBLE);

        Bundle bundle24 = getIntent().getExtras();
        if(bundle24!=null)
        {
            int res_img = bundle24.getInt("zebra");
            img24.setImageResource(res_img);
        }

        ImageView img25 = (ImageView) findViewById(R.id.img25);
        img25.setVisibility(View.VISIBLE);

        Bundle bundle25 = getIntent().getExtras();
        if(bundle25!=null)
        {
            int res_img = bundle25.getInt("quack");
            img25.setImageResource(res_img);
        }

        ImageView img26 = (ImageView) findViewById(R.id.img26);
        img26.setVisibility(View.VISIBLE);

        Bundle bundle26 = getIntent().getExtras();
        if(bundle26!=null)
        {
            int res_img = bundle26.getInt("rabbit");
            img26.setImageResource(res_img);
        }

        ImageView img27 = (ImageView) findViewById(R.id.img27);
        img27.setVisibility(View.VISIBLE);

        Bundle bundle27 = getIntent().getExtras();
        if(bundle27!=null)
        {
            int res_img = bundle27.getInt("xray");
            img27.setImageResource(res_img);
        }






    }
}