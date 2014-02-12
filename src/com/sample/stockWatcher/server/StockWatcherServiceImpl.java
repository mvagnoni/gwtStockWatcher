package com.sample.stockWatcher.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.sample.stockWatcher.client.StockWatcherService;

public class StockWatcherServiceImpl extends RemoteServiceServlet implements StockWatcherService {
    // Implementation of sample interface method
    public String getMessage(String msg) {
        return "Client said: \"" + msg + "\"<br>Server answered: \"Hi!\"";
    }
}