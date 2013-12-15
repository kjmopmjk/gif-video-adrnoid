gif-movie-view
==============

Para uso en xml layout.

            <com.basv.gifmoviewview.widget.GifMovieView
                android:layout_width="wrap_content"
                android:layout_height="wrap_content"
                android:onClick="onGifClick"
                custom:gif="@drawable/my_animated_gif"/>

En codigo java
            
            GifMovieView gif1 = new GifMovieView(context);
	    gif1.setMovieResource(resource);
	    setContentView(gif1);
