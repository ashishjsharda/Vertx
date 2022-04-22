import io.netty.channel.EventLoopGroup;
import io.vertx.core.*;
import io.vertx.core.datagram.DatagramSocket;
import io.vertx.core.datagram.DatagramSocketOptions;
import io.vertx.core.dns.DnsClient;
import io.vertx.core.eventbus.EventBus;
import io.vertx.core.file.FileSystem;
import io.vertx.core.http.HttpClient;
import io.vertx.core.http.HttpClientOptions;
import io.vertx.core.http.HttpServer;
import io.vertx.core.http.HttpServerOptions;
import io.vertx.core.net.NetClient;
import io.vertx.core.net.NetClientOptions;
import io.vertx.core.net.NetServer;
import io.vertx.core.net.NetServerOptions;
import io.vertx.core.shareddata.SharedData;
import io.vertx.core.spi.VerticleFactory;

import java.util.Set;
import java.util.logging.Logger;

public class HelloVertx extends AbstractVerticle {

    public void start(Future<Void> future){
        Logger.getLogger(HelloVertx.class.getName()).info("Getting Started with Vertx");

    }

    public static void main(String[] args) {
        Vertx vertx= new Vertx() {
            @Override
            public boolean isMetricsEnabled() {
                return false;
            }

            @Override
            public Context getOrCreateContext() {
                return null;
            }

            @Override
            public NetServer createNetServer(NetServerOptions netServerOptions) {
                return null;
            }

            @Override
            public NetServer createNetServer() {
                return null;
            }

            @Override
            public NetClient createNetClient(NetClientOptions netClientOptions) {
                return null;
            }

            @Override
            public NetClient createNetClient() {
                return null;
            }

            @Override
            public HttpServer createHttpServer(HttpServerOptions httpServerOptions) {
                return null;
            }

            @Override
            public HttpServer createHttpServer() {
                return null;
            }

            @Override
            public HttpClient createHttpClient(HttpClientOptions httpClientOptions) {
                return null;
            }

            @Override
            public HttpClient createHttpClient() {
                return null;
            }

            @Override
            public DatagramSocket createDatagramSocket(DatagramSocketOptions datagramSocketOptions) {
                return null;
            }

            @Override
            public DatagramSocket createDatagramSocket() {
                return null;
            }

            @Override
            public FileSystem fileSystem() {
                return null;
            }

            @Override
            public EventBus eventBus() {
                return null;
            }

            @Override
            public DnsClient createDnsClient(int i, String s) {
                return null;
            }

            @Override
            public SharedData sharedData() {
                return null;
            }

            @Override
            public long setTimer(long l, Handler<Long> handler) {
                return 0;
            }

            @Override
            public TimeoutStream timerStream(long l) {
                return null;
            }

            @Override
            public long setPeriodic(long l, Handler<Long> handler) {
                return 0;
            }

            @Override
            public TimeoutStream periodicStream(long l) {
                return null;
            }

            @Override
            public boolean cancelTimer(long l) {
                return false;
            }

            @Override
            public void runOnContext(Handler<Void> handler) {

            }

            @Override
            public void close() {

            }

            @Override
            public void close(Handler<AsyncResult<Void>> handler) {

            }

            @Override
            public void deployVerticle(Verticle verticle) {

            }

            @Override
            public void deployVerticle(Verticle verticle, Handler<AsyncResult<String>> handler) {

            }

            @Override
            public void deployVerticle(Verticle verticle, DeploymentOptions deploymentOptions) {

            }

            @Override
            public void deployVerticle(Verticle verticle, DeploymentOptions deploymentOptions, Handler<AsyncResult<String>> handler) {

            }

            @Override
            public void deployVerticle(String s) {

            }

            @Override
            public void deployVerticle(String s, Handler<AsyncResult<String>> handler) {

            }

            @Override
            public void deployVerticle(String s, DeploymentOptions deploymentOptions) {

            }

            @Override
            public void deployVerticle(String s, DeploymentOptions deploymentOptions, Handler<AsyncResult<String>> handler) {

            }

            @Override
            public void undeploy(String s) {

            }

            @Override
            public void undeploy(String s, Handler<AsyncResult<Void>> handler) {

            }

            @Override
            public Set<String> deploymentIDs() {
                return null;
            }

            @Override
            public void registerVerticleFactory(VerticleFactory verticleFactory) {

            }

            @Override
            public void unregisterVerticleFactory(VerticleFactory verticleFactory) {

            }

            @Override
            public Set<VerticleFactory> verticleFactories() {
                return null;
            }

            @Override
            public boolean isClustered() {
                return false;
            }

            @Override
            public <T> void executeBlocking(Handler<Future<T>> handler, boolean b, Handler<AsyncResult<T>> handler1) {

            }

            @Override
            public <T> void executeBlocking(Handler<Future<T>> handler, Handler<AsyncResult<T>> handler1) {

            }

            @Override
            public EventLoopGroup nettyEventLoopGroup() {
                return null;
            }

            @Override
            public WorkerExecutor createSharedWorkerExecutor(String s) {
                return null;
            }

            @Override
            public WorkerExecutor createSharedWorkerExecutor(String s, int i) {
                return null;
            }

            @Override
            public WorkerExecutor createSharedWorkerExecutor(String s, int i, long l) {
                return null;
            }

            @Override
            public Vertx exceptionHandler(@io.vertx.codegen.annotations.Nullable Handler<Throwable> handler) {
                return null;
            }

            @Override
            public @io.vertx.codegen.annotations.Nullable Handler<Throwable> exceptionHandler() {
                return null;
            }


        };
    }
}
