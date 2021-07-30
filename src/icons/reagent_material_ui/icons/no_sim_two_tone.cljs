(ns reagent-material-ui.icons.no-sim-two-tone
  "Imports @material-ui/icons/NoSimTwoTone as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def no-sim-two-tone (create-svg-icon [(e "path" #js {"d" "M7 19h9.23L7 9.77z", "opacity" ".3"}) (e "path" #js {"d" "M3.79 3.74 2.38 5.15l2.74 2.74-.12.12V19c0 1.1.9 2 2 2h10c.35 0 .68-.1.97-.26l1.88 1.88 1.41-1.41L3.79 3.74zM7 19V9.77L16.23 19H7z"}) (e "path" #js {"d" "M10.84 5 9.36 6.47 17 14.11V5z", "opacity" ".3"}) (e "path" #js {"d" "M10.84 5H17v9.11l2 2V5c0-1.1-.9-2-2-2h-6.99L7.95 5.06l1.41 1.41L10.84 5z"})]
                                      "NoSimTwoTone"))
