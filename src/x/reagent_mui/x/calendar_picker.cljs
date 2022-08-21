(ns reagent-mui.x.calendar-picker
  "Imports @mui/x-date-pickers/CalendarPicker as a Reagent component.
   Original documentation is at https://mui.com/x/api/date-pickers/calendar-picker/ ."
  (:require [reagent-mui.util :refer [adapt-react-class]]
            ["@mui/x-date-pickers/CalendarPicker" :as MuiCalendarPicker]))

(def calendar-picker (adapt-react-class MuiCalendarPicker/CalendarPicker "mui-calendar-picker"))