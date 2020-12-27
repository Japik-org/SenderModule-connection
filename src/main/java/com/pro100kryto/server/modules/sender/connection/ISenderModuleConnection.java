package com.pro100kryto.server.modules.sender.connection;

import com.pro100kryto.server.module.IModuleConnection;
import com.pro100kryto.server.utils.datagram.packets.IPacketInProcess;

public interface ISenderModuleConnection extends IModuleConnection {
    void sendPacketAndRecycle(IPacketInProcess packetInProcess);
    void sendPacket(IPacketInProcess packetInProcess);
}