(ns reagent-material-ui.core.list-subheader
  "Imports @material-ui/core/ListSubheader as a Reagent component.
   Original documentation is at https://material-ui.com/api/list-subheader/ ."
  (:require [reagent-material-ui.util :refer [adapt-react-class]]
            [material-ui]))

(def list-subheader (adapt-react-class (.-ListSubheader js/MaterialUI) "mui-list-subheader"))
