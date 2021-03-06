package com.google.android.maps;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Point;
import android.hardware.SensorListener;
import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;
import org.microg.annotation.OriginalApi;
import org.osmdroid.api.IMyLocationOverlay;

public class MyLocationOverlay extends Overlay implements IMyLocationOverlay, SensorListener, LocationListener, Overlay.Snappable {
	private final IMyLocationOverlay wrapped;

	@OriginalApi
	public MyLocationOverlay(Context context, MapView mapView) {
		this(new org.osmdroid.views.overlay.MyLocationOverlay(context, (org.osmdroid.views.MapView) mapView.getWrapped()));
	}

	public MyLocationOverlay(IMyLocationOverlay wrapped) {
		this.wrapped = wrapped;
	}

	@OriginalApi
	@Override
	public void disableCompass() {
		wrapped.disableCompass();
	}

	@OriginalApi
	@Override
	public void disableMyLocation() {
		wrapped.disableMyLocation();
	}

	@OriginalApi
	protected boolean dispatchTap() {
		return false; // TODO
	}

	@OriginalApi
	@Override
	public boolean draw(Canvas canvas, MapView mapView, boolean shadow, long when) {
		return super.draw(canvas, mapView, shadow, when); // TODO
	}

	@OriginalApi
	protected void drawCompass(Canvas canvas, float bearing) {
		// TODO
	}

	@OriginalApi
	protected void drawMyLocation(Canvas canvas, MapView mapView, Location lastFix, GeoPoint myLocation, long when) {
		// TODO
	}

	@OriginalApi
	@Override
	public boolean enableCompass() {
		return wrapped.enableCompass();
	}

	@OriginalApi
	@Override
	public boolean enableMyLocation() {
		return wrapped.enableMyLocation();
	}

	@OriginalApi
	@Override
	public Location getLastFix() {
		return wrapped.getLastFix();
	}

	@OriginalApi
	public GeoPoint getMyLocation() {
		return new GeoPoint(wrapped.getLastFix());
	}

	@OriginalApi
	@Override
	public float getOrientation() {
		return wrapped.getOrientation();
	}

	@OriginalApi
	@Override
	public boolean isCompassEnabled() {
		return wrapped.isCompassEnabled();
	}

	@OriginalApi
	@Override
	public boolean isMyLocationEnabled() {
		return wrapped.isMyLocationEnabled();
	}

	@OriginalApi
	@Override
	public void onAccuracyChanged(int sensor, int accuracy) {
		// TODO
	}

	@OriginalApi
	@Override
	public void onLocationChanged(Location location) {
		// TODO
	}

	@OriginalApi
	@Override
	public void onProviderDisabled(String provider) {
		// TODO
	}

	@OriginalApi
	@Override
	public void onProviderEnabled(String provider) {
		// TODO
	}

	@OriginalApi
	@Override
	public void onSensorChanged(int sensor, float[] values) {
		// TODO
	}

	@OriginalApi
	@Override
	public boolean onSnapToItem(int x, int y, Point snapPoint, MapView mapView) {
		return false; // TODO
	}

	@OriginalApi
	@Override
	public void onStatusChanged(String provider, int status, Bundle extras) {
		wrapped.onStatusChanged(provider, status, extras);
	}

	@OriginalApi
	@Override
	public boolean onTap(GeoPoint p, MapView map) {
		return false; // TODO
	}

	@OriginalApi
	@Override
	public boolean runOnFirstFix(Runnable runnable) {
		return wrapped.runOnFirstFix(runnable);
	}
}
