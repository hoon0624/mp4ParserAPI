$(document).ready(function() {

    function readURL(input) {
        if(input.files && input.files[0]) {
            let reader = new FileReader();
            reader.onload = function(e) {
                console.log(e.target.result);
            }
            reader.readAsDataURL(input.files[0]);
        }
    }

    $('#fileUpload').change(function() {
        readURL(this);
    });

    $('#btn-upload').click(function() {
        let formData = new FormData($('#upload-file')[0]);
        $.ajax({
            type: 'POST',
            url: '/api/upload',
            data: formData,
            contentType: false,
            cache: false,
            processData: false,
            success: function (data) {
                console.log("Success!!! : " + data);
            },
            error: (xhr, ajaxOptions, thrownError) => {
                alert("ERROR: "+xhr);
                console.log("ERR: " + xhr.status +xhr.responseText);
            }
        });
    });
});
