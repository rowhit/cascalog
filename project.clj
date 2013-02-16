(def VERSION "1.10.1-SNAPSHOT")

(defproject cascalog VERSION
  :description "Hadoop without the Hassle."
  :url "http://www.cascalog.org"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :mailing-list {:name "Cascalog user mailing list"
                 :archive "https://groups.google.com/d/forum/cascalog-user"
                 :post "cascalog-user@googlegroups.com"}
  :dependencies [[cascalog/cascalog-core VERSION]
                 [cascalog/cascalog-checkpoint VERSION]
                 [cascalog/cascalog-more-taps VERSION]
                 [cascalog/cascalog-checkpoint VERSION]
                 [cascalog/cascalog-lzo VERSION]
                 [cascalog/cascalog-math VERSION]]
  :plugins [[lein-sub "0.2.1"]
            [codox "0.6.4"]]
  :sub ["cascalog-core"
        "cascalog-checkpoint"
        "cascalog-more-taps"
        "cascalog-elephantdb"
        "cascalog-lzo"
        "cascalog-math"]
  :codox {:src-dir-uri "http://github.com/nathanmarz/cascalog/blob/master"
          :src-linenum-anchor-prefix "L"
          :sources ["cascalog-core/src"
                    "cascalog-checkpoint/src"
                    "cascalog-more-taps/src"
                    "cascalog-elephantdb/src"
                    "cascalog-lzo/src"
                    "cascalog-math/src"]})
