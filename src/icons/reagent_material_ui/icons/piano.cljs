(ns reagent-material-ui.icons.piano
  "Imports @material-ui/icons/Piano as a Reagent component."
  (:require-macros [reagent-material-ui.util :refer [e]])
  (:require [react :as react]
            [reagent-material-ui.util :refer [create-svg-icon]]))

(def piano (create-svg-icon (e "path" #js {"d" "M19 3H5c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2zm-5 11.5h.25V19h-4.5v-4.5H10c.55 0 1-.45 1-1V5h2v8.5c0 .55.45 1 1 1zM5 5h2v8.5c0 .55.45 1 1 1h.25V19H5V5zm14 14h-3.25v-4.5H16c.55 0 1-.45 1-1V5h2v14z"})
                            "Piano"))