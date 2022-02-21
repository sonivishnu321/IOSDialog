# IOSDialog

For using that package please add com.github.sonivishnu321 to your gradle like the following example:

	dependencies {
	        implementation 'com.github.sonivishnu321:IOSDialog:Tag'
	}


for creating two buttons dialog ->
![Screenshot_1645182528](https://user-images.githubusercontent.com/99962380/154672491-435afb43-12d8-46d7-bcc8-61e5eb65d15d.png)

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
![Screenshot_1645182524](https://user-images.githubusercontent.com/99962380/154672313-a31d7743-998c-4e85-8006-c3a36c1a5d83.png)
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




