; It will wait for 8 seconds to appear File Upload dialog.
; Used Title property of File upload dialog window.

  WinWait("File Upload","",8)

; Set control focus to File name Input box of File Upload dialog.
; Used Class property of File upload dialog window and Class+Instance property for File name Input box.

  ControlFocus("[CLASS:#32770]","","Edit1")

  Sleep(3000)

; Set the name of file In File name Edit1 field.
; "Test.txt" file Is located In AutoIT folder of E drive. So we have to provide full path like D:\WWW\966482_pass.doc.

  ControlSetText("[CLASS:#32770]", "", "Edit1", "D:\WWW\966482_pass.doc")

  Sleep(3000)

; Click on the Open button of File Upload dialog.

  ControlClick("[CLASS:#32770]", "","Button1");
