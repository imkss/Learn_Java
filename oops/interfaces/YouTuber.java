package oops.interfaces;

public abstract interface YouTuber extends VideoEditor {
	abstract void makeVideo();
	
	int x = 6;

	default void uploadVideo() {
		System.out.println("Uploading the video");
	}
}
