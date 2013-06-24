package cn.com.lisong.designpattern.adapter;

public class VlcPlayer implements AdvancedMediaPlayer {

	@Override
	public void playVlc(String fileName) {
		System.out.println("Playing vlc file. Name: "+ fileName); 
	}

	@Override
	public void PlayMp4(String fileName) {
		//啥都 不做
	}

}
