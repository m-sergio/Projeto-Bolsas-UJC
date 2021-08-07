
 var xhr = new XMLHttpRequest();
 var nber =mens;

    body = JSON.stringify({"content": +nber, "to": ["258842987709"]});
	xhr.open("POST",'https://platform.clickatell.com/messages',true);
	xhr.setRequestHeader("Content-Type", "application/json");
	xhr.setRequestHeader("Authorization", "VlrClQ21Q6GjVOquseFGHQ==");

	xhr.onreadystatechange = function(){
    if (xhr.readyState == 4 && xhr.status == 200) {
        console.log('success');
    }};
   xhr.send(body);



  