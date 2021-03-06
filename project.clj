(defproject com.oscaro/maximator "0.2.0"
  :description "Thin Clojure wrapper around MaxMind GeoIP2 for IP geolocalization"
  :url "https://github.com/oscaro/maximator"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}

  :min-lein-version "2.0.0"

  :dependencies [[org.clojure/clojure "1.10.1"]
                 [com.maxmind.geoip2/geoip2 "2.14.0"]
                 [gavagai "0.3.2"]]

  :plugins [[lein-codox "0.10.7"]]

  :codox {:source-uri "https://github.com/bpindelski/maximator/blob/{version}/{filepath}#L{line}"
          :metadata   {:doc/format :markdown}})
