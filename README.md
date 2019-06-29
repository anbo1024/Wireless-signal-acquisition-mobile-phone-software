# Wireless-signal-acquisition-mobile-phone-software
Wireless signal acquisition mobile phone software。通过手机app采集周围的无线信号，并将采集到的数据进行打包发送。
客户端首先向服务器发送定位请求，在服务器通过了请求后，通过WIFI扫描周围的信号，采集目标的信号强度，将采集的数据封装后传输到服务器，客户端和服务器之间通过socket通信的方式进行数据传输。服务器在接收到这些数据后通过相应的算法计算出对应的位置信息并显示出来。图中，Scan为扫描数据，SeeData为查看扫描得到的数据 ，Sent为发送数据，StopSent为停止发送。

![linear svm ](https://github.com/anbo1024/Wireless-signal-acquisition-mobile-phone-software/blob/master/img/2.png)
