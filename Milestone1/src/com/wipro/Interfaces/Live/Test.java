package com.wipro.Interfaces.Live;
import com.wipro.Interfaces.music.*;
import com.wipro.Interfaces.music.string.*;
import com.wipro.Interfaces.music.wind.*;
public class Test {

	public static void main(String[] args) {
		Veena v=new Veena();
		v.play();
		Saxaphone s=new Saxaphone();
		s.play();
		Playable pv=new Veena();
		pv.play();
		Playable ps=new Saxaphone();
		ps.play();
		// TODO Auto-generated method stub
	}

}
