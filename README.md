# Steganography-Application

INTRODUCTION
- Image Steganography is widely utilized across government and private sectors for concealing messages or images within cover images, offering extensive commercial applications.
- The application facilitates both encoding and decoding of secret text messages and images into/from cover images, enhancing data security and privacy.
- Users can encode a text message or image into a cover image by first loading the cover image from their gallery and then inputting the text message into a designated text area.
- Additionally, users can embed an image into the cover image by uploading it from the gallery, and upon pressing the encode button, both the text message and image will be successfully concealed within the cover image.
- It's important to note that only one secret, either a text message or an image, can be encoded into a cover image at a time.
- For decoding, users need to load the encoded image into the application and press the decode button to reveal the hidden secret text message or image, ensuring secure communication and data retrieval.

ALGORITHM FOR ENCODING
- Read a cover image and a text message.
- Convert cover image into base 64 format.
- Delete last 4 bits of the base 64 format data of cover image.
- Calculate number of rest of the bits of base 64 format data of the cover image. Name it Pj
- Add the text message there at the end of the base 64 format data of image.
- Write stego image

ALGORITHM FOR DECODING
- Read the base 64 format string of stego image.
- Calculate the number of the bits of base 64 bit format data of stego image.Name it Qj.
- Subtract Pj from Qj. Name it Msglen.
- After knowing the Msglen we can easily retrieve the secret message from Qj. Thus we perform the encoding and decoding process in our image steganography application.

SCREENSHOTS!

![WhatsApp Image 2024-05-14 at 01 46 07_67a51408](https://github.com/Aishu020/Steganography-Application/assets/85669685/de8014f1-9a22-470b-8696-a80508579a7b)

![WhatsApp Image 2024-05-14 at 01 46 07_e6e33163](https://github.com/Aishu020/Steganography-Application/assets/85669685/eebd147d-ff87-47f0-976b-7e1e7ef84e59)

![WhatsApp Image 2024-05-14 at 01 46 07_2f94db08](https://github.com/Aishu020/Steganography-Application/assets/85669685/2d454205-e67d-4f1d-acab-83483e774201)

![WhatsApp Image 2024-05-14 at 01 46 08_458ba371](https://github.com/Aishu020/Steganography-Application/assets/85669685/31921522-c443-46ae-9033-c1df9d9762f9)

![WhatsApp Image 2024-05-14 at 01 46 08_20d0eaad](https://github.com/Aishu020/Steganography-Application/assets/85669685/81317fa7-626b-4d3c-8eba-22b22f736bd4)

![WhatsApp Image 2024-05-14 at 01 47 27_56c488e2](https://github.com/Aishu020/Steganography-Application/assets/85669685/d02784ef-c3f7-4ea7-a64b-aa48ac51cce4)

![WhatsApp Image 2024-05-14 at 01 47 45_764aa155](https://github.com/Aishu020/Steganography-Application/assets/85669685/9e59054a-ea54-42dc-9888-e5967e849b8e)

![WhatsApp Image 2024-05-14 at 01 47 52_d7b107f7](https://github.com/Aishu020/Steganography-Application/assets/85669685/6dd950a3-1102-4d6f-af33-df35587b4d1b)

![WhatsApp Image 2024-05-14 at 01 47 57_46be0c79](https://github.com/Aishu020/Steganography-Application/assets/85669685/e744d7b2-54db-4fa3-937e-d85aca2c3a78)

![WhatsApp Image 2024-05-14 at 01 48 12_e4ae0f11](https://github.com/Aishu020/Steganography-Application/assets/85669685/3e09ee8c-d663-4ac3-80ba-be7c66438c5e)

![WhatsApp Image 2024-05-14 at 01 48 13_4e71774c](https://github.com/Aishu020/Steganography-Application/assets/85669685/771d0041-2ff2-4fc8-9f67-b4edf45d8d4f)

![WhatsApp Image 2024-05-14 at 01 48 32_73bb6b0f](https://github.com/Aishu020/Steganography-Application/assets/85669685/28af4737-31a1-4ffa-9764-1f13cbacc682)

![WhatsApp Image 2024-05-14 at 01 48 19_eeb6da86](https://github.com/Aishu020/Steganography-Application/assets/85669685/3adbc648-8f9e-4622-812d-431dd291dd09)














