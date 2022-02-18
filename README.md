# IOSDialog

for creating two buttons dialog -> 
```
iOSDialogBuilder(this@MainActivity)
        .setTitle(getString(R.string.example_title))
        .setSubtitle(getString(R.string.example_subtitle))
        .setBoldPositiveLabel(true)
        .setCancelable(false)
        .setPositiveListener(
            getString(R.string.ok)
        ) { dialog ->
            Toast.makeText(this@MainActivity, "Clicked!", Toast.LENGTH_LONG).show()
            dialog.dismiss()
        }
        .setNegativeListener(
            getString(R.string.dismiss)
        ) { dialog -> dialog.dismiss() }
        .build().show()
   ```
    

        
For Creating one button dialog ->
```
iOSDialogBuilder(this@MainActivity)
        .setTitle(getString(R.string.example_title))
        .setSubtitle(getString(R.string.example_subtitle))
        .setBoldPositiveLabel(true)
        .setNegativeButtonExist(false)
        .setCancelable(false)
        .setPositiveListener(
            getString(R.string.ok)
        ) { dialog ->
            Toast.makeText(this@MainActivity, "Clicked!", Toast.LENGTH_LONG).show()
            dialog.dismiss()
        }
        .build().show()```

![Screenshot_1645182524](https://user-images.githubusercontent.com/99962380/154672313-a31d7743-998c-4e85-8006-c3a36c1a5d83.png)


