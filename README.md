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
