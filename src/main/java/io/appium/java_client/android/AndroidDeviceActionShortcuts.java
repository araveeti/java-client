package io.appium.java_client.android;

import io.appium.java_client.DeviceActionShortcuts;

public interface AndroidDeviceActionShortcuts extends DeviceActionShortcuts {

	/**
	 * Send a key event to the device
	 *
	 * @param key
	 *            code for the key pressed on the device
	 */
	public void pressKeyCode(int key);

	/**
	 * Send a key event along with an Android metastate to an Android device
	 * Metastates are things like *shift* to get uppercase characters
	 * 
	 * @param key code for the key pressed on the Android device
	 * @param metastate metastate for the keypress
	 * 
	 * @see AndroidKeyCode
	 * @see AndroidKeyMetastate
	 */
	public void pressKeyCode(int key, Integer metastate);

	/**
	 * Send a long key event to the device
	 *
	 * @param key
	 *            code for the key pressed on the device
	 */
	public void longPressKeyCode(int key);

	/**
	 * Send a long key event along with an Android metastate to an Android device
	 * Metastates are things like *shift* to get uppercase characters
	 *
	 * @param key code for the key pressed on the Android device
	 * @param metastate metastate for the keypress
	 *
	 * @see AndroidKeyCode
	 * @see AndroidKeyMetastate
	 */
	public void longPressKeyCode(int key, Integer metastate);
}
