function readFile(f) {
    let file = f.files;
    let reader = new FileReader();
    let form = $('#upload-file');
    reader.onload = (n) => {
        console.log(n.target.result);
        console.log("TYPE " + typeof(file[0]));
    }
    reader.readAsDataURL(file[0]);
    console.log(file[0]);
    let formData = new FormData();
    formData.append("file", file[0]);

    $.ajax({
        type: "POST",
        url: "/api/uploadParse",
        data: formData,
        cache: false,
        enctype: 'multipart/form-data',
        processData: false,
        contentType: false,
        success: function(data) {
            console.log("Success!\n" + data);
        },
        error: function(res) {
            console.log('ERR ' + res);
        }
    });

    // $.ajax({
    //     type: 'GET',
    //     url: '/api/test',
    //     cache: false,
    //     async: true,
    //     success: data => {
    //         console.log("succes: " + data);
    //     }
    // });

    // $.ajax({
    //     type: 'POST',
    //     url: '/api/upload',
    //     data: formData,
    //     cache: false,
    //     async: true,
    //     success: data => console.log("successful: " + data)
    // });
}
