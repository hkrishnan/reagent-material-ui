(ns reagent-material-ui.icons.developer-board
  "Imports @material-ui/icons/DeveloperBoard as a Reagent component."
  (:require-macros [reagent-material-ui.macro :refer [e]])
  (:require [reagent-material-ui.util :refer [create-svg-icon]]))

(def developer-board (create-svg-icon (e (.-Fragment js/React) nil (e "path" #js {"d" "M22 9V7h-2V5c0-1.1-.9-2-2-2H4c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h14c1.1 0 2-.9 2-2v-2h2v-2h-2v-2h2v-2h-2V9h2zm-4 10H4V5h14v14zM6 13h5v4H6zm6-6h4v3h-4zM6 7h5v5H6zm6 4h4v6h-4z"}) (e "path" #js {"d" "M0 0h24v24H0zm0 0h24v24H0z", "fill" "none"}))
                                      "DeveloperBoard"))