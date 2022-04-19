(ns reagent-mui.x.static-time-picker-pro
  "Imports @mui/x-date-pickers-pro/StaticTimePicker as a Reagent component.
   Original documentation is at https://mui.com/x/api/date-pickers/static-time-picker/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/x-date-pickers-pro/StaticTimePicker" :as MuiStaticTimePicker]))

(def static-time-picker (adapt-react-class (.-StaticTimePicker MuiStaticTimePicker) "mui-static-time-picker"))
