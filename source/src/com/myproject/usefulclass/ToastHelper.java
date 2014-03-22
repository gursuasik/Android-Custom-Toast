package com.myproject.usefulclass;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * �zelle�tirilmi� toast mesajlar�n� g�sterilmek �zere tasarlanm�� s�n�ft�r.
 * @author �smail KOCACAN
 *
 */
public class ToastHelper {

	private final static int TOAST_LAYOUT_ID_FAIL  = R.layout.toast_fail; 
	private final static int TOAST_LAYOUT_ID_SUCCSESS  = R.layout.toast_success;
	
	private final static int TOAST_ID_TEXTVIEW_SUCCSESS = R.id.toast_message;
	private final static int TOAST_ID_TEXTVIEW_FAIL = R.id.toast_fail_message;
	
	
	/**
	 * Ba�ar�l� bir bir toast mesaj� g�sterilmesini sa�lar.
	 * @param activity Activity nesnesi.
	 * @param message G�strilecek olan mesaj metnidir.
	 */
	public static void showSuccessToast(Activity activity,String message){
		LayoutInflater inflater = activity.getLayoutInflater();
        View layout = inflater.inflate(TOAST_LAYOUT_ID_SUCCSESS, (ViewGroup) activity.findViewById(TOAST_ID_TEXTVIEW_SUCCSESS));
        ((TextView) layout.findViewById(TOAST_ID_TEXTVIEW_SUCCSESS)).setText(message);
        Toast toast = new Toast(activity.getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        //toast.setGravity(Gravity.CENTER, Gravity.CENTER_HORIZONTAL, Gravity.CENTER_VERTICAL);
       // toast.setMargin(0, 1);
        toast.show();
	}

	/**
	 * Ba�ar�l� bir bir toast mesaj� g�sterilmesini sa�lar.
	 * @param context Context nesnesi.
	 * @param message G�strilecek olan mesaj metnidir.
	 */
	public static void showSuccessToast(Context context,String message){
		LayoutInflater inflater = LayoutInflater.from(context);
		View view = inflater.inflate(TOAST_LAYOUT_ID_SUCCSESS, null);
		TextView toast_message =(TextView)view.findViewById(TOAST_ID_TEXTVIEW_SUCCSESS);
		toast_message.setText(message);
        Toast toast = new Toast(context);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(view);
        //toast.setGravity(Gravity.CENTER, Gravity.CENTER_HORIZONTAL, Gravity.CENTER_VERTICAL);
       // toast.setMargin(0, 1);
        toast.show();
	}
	
	/**
	 * Ba�ar�s�z bir toast mesaj� g�sterilmesini sa�lar.
	 * @param activity Activity nesnesi.
	 * @param message G�strilecek olan mesaj metnidir.
	 */
	public static void showFailToast(Activity activity,String message){
		LayoutInflater inflater = activity.getLayoutInflater();
        View layout = inflater.inflate(TOAST_LAYOUT_ID_FAIL, (ViewGroup) activity.findViewById(TOAST_ID_TEXTVIEW_FAIL));
        ((TextView) layout.findViewById(TOAST_ID_TEXTVIEW_FAIL)).setText(message);
        Toast toast = new Toast(activity.getApplicationContext());
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        //toast.setGravity(Gravity.CENTER, Gravity.CENTER_HORIZONTAL, Gravity.CENTER_VERTICAL);
        //toast.setMargin(0, 1);
        toast.show();
	}

	/**
	 * Ba�ar�s�z bir toast mesaj� g�sterilmesini sa�lar.
	 * @param context Context nesnesi
	 * @param message G�strilecek olan mesaj metnidir.
	 */
	public static void showFailToast(Context context,String message){
		LayoutInflater inflater = LayoutInflater.from(context);
		View view = inflater.inflate(TOAST_LAYOUT_ID_FAIL, null);
		TextView toast_message =(TextView)view.findViewById(TOAST_ID_TEXTVIEW_FAIL);
		toast_message.setText(message);
        Toast toast = new Toast(context);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(view);
        //toast.setGravity(Gravity.CENTER, Gravity.CENTER_HORIZONTAL, Gravity.CENTER_VERTICAL);
        //toast.setMargin(0, 1);
        toast.show();
	}
}
