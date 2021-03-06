(ns reagent-material-ui.icons.dark-mode-rounded
  "Imports @material-ui/icons/DarkModeRounded as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def dark-mode-rounded (create-svg-icon (e "path" #js {"d" "M11.01 3.05C6.51 3.54 3 7.36 3 12c0 4.97 4.03 9 9 9 4.63 0 8.45-3.5 8.95-8 .09-.79-.78-1.42-1.54-.95-.84.54-1.84.85-2.91.85-2.98 0-5.4-2.42-5.4-5.4 0-1.06.31-2.06.84-2.89.45-.67-.04-1.63-.93-1.56z"})
                                        "DarkModeRounded"))