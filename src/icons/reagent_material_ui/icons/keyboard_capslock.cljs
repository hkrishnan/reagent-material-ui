(ns reagent-material-ui.icons.keyboard-capslock
  "Imports @material-ui/icons/KeyboardCapslock as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [create-svg-icon e]])
  (:require [react :as react]
            ["@material-ui/core/SvgIcon" :as SvgIcon]
            [reagent-material-ui.util]))

(def keyboard-capslock (create-svg-icon (e "path" #js {"d" "M12 8.41 16.59 13 18 11.59l-6-6-6 6L7.41 13 12 8.41zM6 18h12v-2H6v2z"})
                                        "KeyboardCapslock"))
