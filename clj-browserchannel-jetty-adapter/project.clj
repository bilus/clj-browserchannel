(defproject bilus/clj-browserchannel-jetty-adapter "0.0.6"
  :description "Jetty async adapter for BrowserChannel"
  :url ""
  :dependencies [[ring/ring-core "1.3.1"]
                 [ring/ring-servlet "1.3.1"]
                 [org.eclipse.jetty/jetty-server "8.1.16.v20140903"];; includes ssl
                 [bilus/clj-browserchannel-server "0.1.0"]]
  :profiles {:provided
              {:dependencies
                [[org.clojure/clojure "1.6.0"]]}})
