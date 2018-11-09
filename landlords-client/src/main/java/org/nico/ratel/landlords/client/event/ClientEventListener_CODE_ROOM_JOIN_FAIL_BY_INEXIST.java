package org.nico.ratel.landlords.client.event;

import org.nico.ratel.landlords.enums.ClientEventCode;
import org.nico.ratel.landlords.print.SimplePrinter;

import io.netty.channel.Channel;

public class ClientEventListener_CODE_ROOM_JOIN_FAIL_BY_INEXIST extends ClientEventListener{

	@Override
	public void call(Channel channel, String data) {
		SimplePrinter.println("Join fail, room " + data + " is inexist!");
		ClientEventListener.get(ClientEventCode.CODE_SHOW_OPTIONS).call(channel, data);
	}



}
