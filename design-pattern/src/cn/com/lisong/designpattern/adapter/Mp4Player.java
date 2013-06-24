package cn.com.lisong.designpattern.adapter;

public class Mp4Player implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		//啥都不做
	}

	@Override
	public void PlayMp4(String fileName) {
		System.out.println("Playing mp4 file. Name: "+ fileName); 
	}

}
