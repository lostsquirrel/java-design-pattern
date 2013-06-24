package cn.com.lisong.designpattern.adapter;

public class MediaAdapter implements MediaPlayer {

	AdvancedMediaPlayer advancedMediaPlayer;
	
	@Override
	public void play(String audioType, String fileName) {
		if ("vlc".equalsIgnoreCase(audioType)) {
			advancedMediaPlayer = new VlcPlayer();
			advancedMediaPlayer.playVlc(fileName);
		} else if ("mp4".equalsIgnoreCase(audioType)) {
			advancedMediaPlayer = new Mp4Player();
			advancedMediaPlayer.PlayMp4(fileName);
		}
	}

}
