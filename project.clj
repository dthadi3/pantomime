(defproject com.novemberain/pantomime "1.6.0-SNAPSHOT"
  :min-lein-version "2.0.0"
  :description "A tiny Clojure library that deals with MIME types"
  :license { :name "Eclipse Public License" }
  :source-paths ["src/clojure"]
  :dependencies [[org.clojure/clojure "1.4.0"]
                 [org.apache.tika/tika-core "1.3"]]
  :profiles {:dev {:resource-paths ["test/resources"]
                   :dependencies [[clj-http "0.4.4"]]}
             :1.3 {:dependencies [[org.clojure/clojure "1.3.0"]]}
             :1.5 {:dependencies [[org.clojure/clojure "1.5.0-RC2"]]}}
  :repositories {"sonatype" {:url "http://oss.sonatype.org/content/repositories/releases"
                             :snapshots false
                             :releases {:checksum :fail :update :always}}
                 "sonatype-snapshots" {:url "http://oss.sonatype.org/content/repositories/snapshots"
                                       :snapshots true
                                       :releases {:checksum :fail :update :always}}}
  :aliases  {"all" ["with-profile" "dev:dev,1.3:dev,1.5"]}
  :warn-on-reflection true)
