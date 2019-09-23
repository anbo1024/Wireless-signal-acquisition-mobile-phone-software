<RelativeLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:paddingBottom="@dimen/activity_vertical_margin"
    android:paddingLeft="@dimen/activity_horizontal_margin"
    android:paddingRight="@dimen/activity_horizontal_margin"
    android:paddingTop="@dimen/activity_vertical_margin"
    tools:context="com.example.indoorplace.MainActivity" >

    <LinearLayout
        android:id="@+id/linearLayout1"
        android:layout_width="fill_parent"
        android:layout_height="70sp"
        android:layout_alignParentBottom="true"
        android:layout_centerHorizontal="true"
        android:orientation="horizontal" >

        <Button
            android:id="@+id/but_wiFiPositioning"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginTop="10sp"
            android:layout_weight="1"
            android:background="@android:color/white"
            android:drawableTop="@drawable/wifi_50_mygreen"
            android:paddingBottom="2dp"
            android:paddingTop="2dp"
            android:text="WiFi"
            android:textColor="@color/my_green"
            android:textSize="15sp" />

        <Button
            android:id="@+id/but_positioningConfigure"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginTop="10sp"
            android:layout_weight="1"
            android:background="@android:color/white"
            android:drawableTop="@drawable/configuration_50_black"
            android:paddingBottom="2dp"
            android:paddingTop="2dp"
            android:text="Configure"
            android:textSize="15sp" />

        <Button
            android:id="@+id/but_positioningShow"
            android:layout_width="wrap_content"
            android:layout_height="wrap_content"
            android:layout_marginTop="10sp"
            android:layout_weight="1"
            android:background="@android:color/white"
            android:drawableTop="@drawable/location_50_black"
            android:paddingBottom="2dp"
            android:paddingTop="2dp"
            android:text="Show"
            android:textSize="15sp" />
    </LinearLayout>
     <ProgressBar
        android:id="@+id/progressBar_obtainRss"
        style="@android:style/Widget.ProgressBar.Horizontal"
        android:layout_width="fill_parent"
        android:layout_height="20dp"
        android:layout_marginLeft="50dp"
        android:layout_marginRight="50dp"
        android:layout_marginBottom="150dp"
        android:visibility="gone" />
    

    <Button
        android:id="@+id/button3"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignLeft="@+id/button2"
        android:layout_alignRight="@+id/button2"
        android:layout_below="@+id/button2"
        android:layout_marginTop="29dp"
        android:text="SentData" />

    <Button
        android:id="@+id/button2"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignLeft="@+id/button1"
        android:layout_alignRight="@+id/button1"
        android:layout_below="@+id/button1"
        android:layout_marginTop="30dp"
        android:text="SeeData" />

    <Button
        android:id="@+id/button1"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignLeft="@+id/linearLayout1"
        android:layout_alignParentTop="true"
        android:layout_marginLeft="20dp"
        android:layout_marginTop="34dp"
        android:text="ScanData" />

    <Button
        android:id="@+id/button4"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content"
        android:layout_alignLeft="@+id/button3"
        android:layout_alignRight="@+id/button3"
        android:layout_below="@+id/button3"
        android:layout_marginTop="20dp"
        android:text="StopSent" />

</RelativeLayout>
